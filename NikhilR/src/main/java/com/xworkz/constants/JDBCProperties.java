package com.xworkz.constants;

	public enum JDBCProperties {
		URL("jdbc:mysql://localhost:3306/xworkz-btm-march"), USERNAME("root"), SECRET("ranjitha@2000");

		private String values;

		private JDBCProperties(String values) {
			this.values = values;
		}

		public String getValues() {
			return values;
		}
}
