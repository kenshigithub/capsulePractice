class DMMakerWithCapsule{
	public static void main(String[] args){
		CapsuleCustomerInfo mameta = new CapsuleCustomerInfo(); //CustomerInfo�C���X�^���X"mameta"�̐���
		mameta.setName("Mameta", "Hanako"); //mameta�̎������Z�b�g
		
		/*�d�l�ύX�O�E�㎁���擾�iCustomerInfo�N���X�̕ύX�Ɉ˂�Ȃ��j*/
		String name = mameta.getName(); //mameta�̎������擾
		
		//�ύX�Ȃ�
		
		
		
		
		System.out.println("Dear " + name + ".");
	}
}

