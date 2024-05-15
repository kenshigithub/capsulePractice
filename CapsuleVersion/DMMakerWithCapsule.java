class DMMakerWithCapsule{
	public static void main(String[] args){
		CapsuleCustomerInfo mameta = new CapsuleCustomerInfo(); //CustomerInfoインスタンス"mameta"の生成
		mameta.setName("Mameta", "Hanako"); //mametaの氏名をセット
		
		/*仕様変更前・後氏名取得（CustomerInfoクラスの変更に依らない）*/
		String name = mameta.getName(); //mametaの氏名を取得
		
		//変更なし
		
		
		
		
		System.out.println("Dear " + name + ".");
	}
}

