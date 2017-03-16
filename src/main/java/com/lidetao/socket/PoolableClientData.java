package com.lidetao.socket;

import org.apache.commons.pool.BasePoolableObjectFactory;
import org.apache.commons.pool.PoolableObjectFactory;
import org.quickserver.net.server.ClientData;
import org.quickserver.util.pool.PoolableObject;

/**
 * 客户端连接池
 * 
 * @author Administrator
 *
 */
public class PoolableClientData implements ClientData, PoolableObject {

	private static final long serialVersionUID = -2967533203569589642L;

	@Override
	public boolean isPoolable() {
		return true;
	}

	@Override
	public PoolableObjectFactory<?> getPoolableObjectFactory() {

		return new BasePoolableObjectFactory<Object>() {

			public void passivateObject(Object obj) {
				if (obj == null)
					return;
			}

			public void destroyObject(Object obj) {
				if (obj == null)
					return;

				passivateObject(obj);

				obj = null;
			}

			public boolean validateObject(Object obj) {
				if (obj == null) {
					return false;
				} else {
					return true;
				}
			}

			@Override
			public Object makeObject() throws Exception {
				return new PoolableClientData();
			}

		};

	}

}
