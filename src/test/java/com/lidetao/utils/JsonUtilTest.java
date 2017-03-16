package com.lidetao.utils;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.gson.reflect.TypeToken;
import com.lidetao.dao.po.WikiBlock;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JsonUtilTest {

	private String json;
	private WikiBlock bean;

	@Before
	public void init_data() {

		json = "{\"id\":212,\"block\":\"3\"}";

		bean = new WikiBlock();
		bean.setBlock("123");
		bean.setId(13212);
	}

	@Test
	public void test001toJson() {
		String json = JsonUtil.toJson(bean);
		System.out.println(json);
		Assert.assertNotNull(json);
	}

	@Test
	public void test002toJson() {
		String json = JsonUtil.toFormatJson(bean);
		System.out.println(json);
		Assert.assertNotNull(json);
	}

	@Test
	public void test003fromJson() {
		WikiBlock bean = JsonUtil.fromJson(json, WikiBlock.class);
		Assert.assertNotNull(bean);
		System.out.println(bean.getBlock());
		System.out.println(bean.getId());
	}

	@Test
	public void test004fromJson() {
		Map<String, Object> bean = JsonUtil.fromJson(json,
				new TypeToken<Map<String, Object>>() {
				});
		Assert.assertNotNull(bean);
		System.out.println(bean.get("block"));
		System.out.println(bean.get("id"));
	}

}
