package com.lidetao.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * mapper构造器
 * 
 * @author Administrator
 *
 */
public class MapperCreator {

	private static final Log log = LogFactory.getLog(MapperCreator.class);

	/**
	 * mybatis sqlsession工厂
	 */
	private static SqlSessionFactory sqlSessionFactory;

	public static void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		MapperCreator.sqlSessionFactory = sqlSessionFactory;
	}

	/**
	 * 执行自定义sql操作
	 * 
	 * @param mapperCls
	 * @param sqlExecutor
	 * @return
	 */
	public static <T, R> R exeMapper(Class<T> mapperCls,
			ISQLExecutor<T, R> sqlExecutor) {

		// sqlsession工厂检测
		if (sqlSessionFactory == null) {
			log.warn("mybatis sqlsession工厂未设置");
			return null;
		}

		// 开启session
		SqlSession session = sqlSessionFactory.openSession();

		try {
			// 执行sql操作
			T mapper = session.getMapper(mapperCls);
			return sqlExecutor.execute(mapper);
		} catch (Exception e) {
			log.warn("sql操作存在未捕捉异常", e);
			return null;
		} finally {
			// 关闭session
			if (session != null) {
				session.close();
			}
		}

	}

	/**
	 * sql执行类
	 * 
	 * @author Administrator
	 *
	 */
	public static interface ISQLExecutor<T, R> {
		R execute(T mapper);
	}

}
