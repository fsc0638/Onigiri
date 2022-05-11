package Kinokuniya;
//值、方法 -> 經過class包覆 -> 區域變數、方法
//class:執行包覆化必須的組件
public class Order {
		//設定區域變數
		//包覆化特徵:
			//限制內容（在區域變數前放置private）
			//若開放其他class使用內容（Get、Set...），使用public將其公開
		private String id;
		private String date;
		private int price;
		private int quantity;
		private boolean delivery;
		//初值（Object初始化專區）
		public Order(String id, String date, int price, int quantity, boolean delivery) {
			this.id = id;
			this.date = date;
			this.price = price;
			this.quantity = quantity;
			this.delivery = delivery;
		}
		//toString方法
			//印出實作內容自動生成區域變數之值（回傳值），並以[陣列]方式表示
			//印出指令:
			//System.out.println(s1.toString());
			//或是可簡化為 System.out.println(s1); 兩者結果相同
		@Override
		public String toString() {
			return "Order [id=" + id + ", date=" + date + ", price=" + price + ", quantity=" + quantity + ", delivery="
					+ delivery + "]";
		}
		//追加實作方法
		public int amount() {
			return price * quantity;
		}
		public boolean isHighSales() {
			return amount()>=500000;
		}
		//Get 方法
		public String getId() {
			return id;
		}
		public String getDate() {
			return date;
		}
		public int getPrice() {
			return price;
		}
		public int getQuantity() {
			return quantity;
		}
		public boolean isDelivery() {
			return delivery;
		}
		//Set 方法
		public void setId(String id) {
			this.id = id;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public void setDelivery(boolean delivery) {
			this.delivery = delivery;
		}
}