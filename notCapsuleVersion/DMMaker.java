class DMMaker{
	public static void main(String[] args){
		CustomerInfo mameta = new CustomerInfo(); //CustomerInfo�C���X�^���X"mameta"�̐���
		mameta.setName("Mameta", "Hanako"); //mameta�̎������Z�b�g
		
		/*�d�l�ύX�O�����擾*/
		String name = mameta.name; //mameta�̎������擾
		
		/*�d�l�ύX�㎁���擾�i!!CustomerInfo�N���X�̕ύX���g�y!!�j*/
		/*
		//getter���Ȃ��̂Ńt�B�[���h���璼��mameta�̎������擾
		String name =  mameta.firstNmae + " " + mameta.lastName;
		*/
		
		System.out.println("Dear " + name + ".");
	}
}

