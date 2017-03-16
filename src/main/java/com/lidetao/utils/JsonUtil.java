package com.lidetao.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * json转换工具
 * 
 * @author Administrator
 *
 */
public class JsonUtil {

	/**
	 * 实现格式化的时间字符串转时间对象
	 */
	private static final String DATEFORMAT_default = "yyyy-MM-dd HH:mm:ss";

	/**
	 * java对象转json
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		Gson gson = new GsonBuilder().setDateFormat(DATEFORMAT_default)
				.create();
		return gson.toJson(obj);
	}

	/**
	 * java对象转格式化json
	 * 
	 * @param obj
	 * @return
	 */
	public static String toFormatJson(Object obj) {
		Gson gson = new GsonBuilder().setPrettyPrinting()
				.setDateFormat(DATEFORMAT_default).create();
		return gson.toJson(obj);
	}

	/**
	 * json字符串转java bean
	 * 
	 * @param json
	 * @param cls
	 * @return
	 */
	public static <T> T fromJson(String json, Class<T> cls) {
		Gson gson = new GsonBuilder().setDateFormat(DATEFORMAT_default)
				.create();
		return gson.fromJson(json, cls);
	}

	public static <T> T fromJson(String json, TypeToken<T> typeToken) {
		Gson gson = new GsonBuilder()
		/**
		 * 重写map的反序列化
		 */
		.registerTypeAdapter(new TypeToken<Map<String, Object>>() {
		}.getType(), new MapTypeAdapter()).create();

		return gson.fromJson(json, typeToken.getType());
	}

	public static class MapTypeAdapter extends TypeAdapter<Object> {

		@Override
		public Object read(JsonReader in) throws IOException {
			JsonToken token = in.peek();
			switch (token) {
			case BEGIN_ARRAY:
				List<Object> list = new ArrayList<Object>();
				in.beginArray();
				while (in.hasNext()) {
					list.add(read(in));
				}
				in.endArray();
				return list;

			case BEGIN_OBJECT:
				Map<String, Object> map = new LinkedTreeMap<String, Object>();
				in.beginObject();
				while (in.hasNext()) {
					map.put(in.nextName(), read(in));
				}
				in.endObject();
				return map;

			case STRING:
				return in.nextString();

			case NUMBER:
				/**
				 * 改写数字的处理逻辑，将数字值分为整型与浮点型。
				 */
				double dbNum = in.nextDouble();

				// 数字超过long的最大值，返回浮点类型
				if (dbNum > Long.MAX_VALUE) {
					return dbNum;
				}

				// 判断数字是否为整数值
				long lngNum = (long) dbNum;
				if (dbNum == lngNum) {
					return lngNum;
				} else {
					return dbNum;
				}

			case BOOLEAN:
				return in.nextBoolean();

			case NULL:
				in.nextNull();
				return null;

			default:
				throw new IllegalStateException();
			}
		}

		@Override
		public void write(JsonWriter out, Object value) throws IOException {
			// 序列化无需实现
		}

	}

}
