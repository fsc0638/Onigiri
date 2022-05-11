package Kinokuniya;

public class sales_sample {

	public static void main(String[] args) {
		Order s1 = new Order("ICBK61", "2020/07/11", 2100, 5, true);
		Order s2 = new Order("ICBK62", "2020/09/02", 1050, 10, false);
		Order s3 = new Order("ICBK63", "2020/07/15", 1050, 12, true);
		System.out.printf("型番：%s\n受注日：%s\n価格：%d\n個数：%d\n納品：%b\n",s1.getId(),s1.getDate(),s1.getPrice(),s1.getQuantity(),s1.getClass());
		System.out.println("売上："+s1.amount());
		System.out.println("HS = "+s1.isHighSales());
		System.out.println(s1);
		System.out.println(s1.toString());
	}

}
