//�J�v�Z�������Ă���܂���

class CustomerInfo{
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
	
	/*�d�l�ύX�Osetter���\�b�h*/
	public void setName(String last, String first){
		name = last + " " + first;
	}
	
	//getter���\�b�h�Ȃ�
	
	
	
	/*�d�l�ύX��setter���\�b�h*/
	/*
	public void setName(String first, String last){
		firstName = first;
		lastName = last;
	}
	*/
}
