package com.lidetao.action.vo;

/**
 * block操作的vo集合
 * 
 * @author Administrator
 *
 */
public class BlockVos {

	/**
	 * 获取block列表的vo
	 * 
	 * @author Administrator
	 *
	 */
	public static class VoForListBlock {

		private String file;

		public String getFile() {
			return file;
		}

		public void setFile(String file) {
			this.file = file;
		}

	}

	/**
	 * 添加一个对象
	 * 
	 * @author Administrator
	 *
	 */
	public static class VoForInsertBlock {

		private String theme;

		public String getTheme() {
			return theme;
		}

		public void setTheme(String theme) {
			this.theme = theme;
		}

	}

	public static class VoForUpdateBlock {
		private String file;
		private String theme;

		public String getFile() {
			return file;
		}

		public void setFile(String file) {
			this.file = file;
		}

		public String getTheme() {
			return theme;
		}

		public void setTheme(String theme) {
			this.theme = theme;
		}

	}

}
