class DMMaker{
	public static void main(String[] args){
		CustomerInfo mameta = new CustomerInfo(); //CustomerInfoインスタンス"mameta"の生成
		mameta.setName("Mameta", "Hanako"); //mametaの氏名をセット
		
		/*仕様変更前氏名取得*/
		String name = mameta.name; //mametaの氏名を取得
		
		/*仕様変更後氏名取得（!!CustomerInfoクラスの変更が波及!!）*/
		/*
		//getterがないのでフィールドから直接mametaの氏名を取得
		String name =  mameta.firstNmae + " " + mameta.lastName;
		*/
		
		System.out.println("Dear " + name + ".");
	}
}

