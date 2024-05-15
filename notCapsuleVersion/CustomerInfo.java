//カプセル化してありません

class CustomerInfo{
	int id; //顧客番号フィールド
	
	/*仕様変更前氏名フィールド*/
	String name; 
	
	/*仕様変更後氏名フィールド*/
	/*
	String firstName;
	String lastName;
	*/
	
	String address; //住所フィールド
	String phoneNumber; //電話番号フィールド
	
	/*仕様変更前setterメソッド*/
	public void setName(String last, String first){
		name = last + " " + first;
	}
	
	//getterメソッドなし
	
	
	
	/*仕様変更後setterメソッド*/
	/*
	public void setName(String first, String last){
		firstName = first;
		lastName = last;
	}
	*/
}
