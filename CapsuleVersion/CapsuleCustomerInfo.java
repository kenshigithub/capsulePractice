//カプセル化してあります

class CapsuleCustomerInfo{
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
	
	/*仕様変更前setter, getterメソッド*/
	public void setName(String last, String first){
		name = last + " " + first;
	}
	
	public String getName(){
		return name;
	}
	
	/*仕様変更後setter, getterメソッド*/
	/*
	public void setName(String first, String last){
		firstName = first;
		lastName = last;
	}
	
	public String getName(){
		return lastName + " " + "firstName";
	}
	*/
}
