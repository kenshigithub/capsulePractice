//�J�v�Z�������Ă���܂�

class CapsuleCustomerInfo{
	int id; //�ڋq�ԍ��t�B�[���h
	
	/*�d�l�ύX�O�����t�B�[���h*/
	String name; 
	
	/*�d�l�ύX�㎁���t�B�[���h*/
	/*
	String firstName;
	String lastName;
	*/
	
	String address; //�Z���t�B�[���h
	String phoneNumber; //�d�b�ԍ��t�B�[���h
	
	/*�d�l�ύX�Osetter, getter���\�b�h*/
	public void setName(String last, String first){
		name = last + " " + first;
	}
	
	public String getName(){
		return name;
	}
	
	/*�d�l�ύX��setter, getter���\�b�h*/
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
