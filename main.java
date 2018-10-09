
public class main {

	
	public static void main(String[] args) {
			kotak kotakHitam = new kotak();
			
			kotakHitam.setPanjang(6);
			kotakHitam.setLebar(4);
			
			kotakHitam.hitungLuas();
			kotakHitam.hitungKeliling();
		
			System.out.println("Panjang : " + kotakHitam.getPanjang());
			System.out.println("Lebar : " + kotakHitam.getLebar());
			System.out.println("LuasKotak : " + kotakHitam.getLuas());
			System.out.println("KelilingKotak " + kotakHitam.getKeliling());
			System.out.println("___________________________________________");
					
			{
				//Hasil Mahasiswa
				mahasiswa mhs1 = new mahasiswa();
				mhs1.setNama("M. Rifai");
				mhs1.setNim("D0217009");
				mhs1.setAlamat("Tinambung");
				mhs1.setGolonganDarah("AB");
				mhs1.setStatus("Mahasiswa");
				mhs1.setTinggiBadan(165);
				mhs1.setBeratBadan(45);
				
				System.out.println("Nama : " + mhs1.getNama());
				System.out.println("Nim : " + mhs1.getNim());
				System.out.println("Alamat : " + mhs1.getAlamat());
				System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
				System.out.println("Status : " + mhs1.getStatus());
				System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
				System.out.println("BeratBadan : " + mhs1.getBaratBadan());
				System.out.println("---------------------------------------------");

				System.out.println("------Object Kelas node------");
				//membuat object darikelas node
				node node = new node();
				
				//method setter node
				node.label = "ROTI";
				node.Value =2;
				
				//method getter node
				System.out.println("Nama Label : " + node.getlabel());
				System.out.println("jumlah label : " + node.getValue());
				
				
				//membuat object darikelas stack
				stack stack = new stack();
				System.out.println("------Object Kelas stack------");
				stack.value[0] = "mila";
				stack.value[1] = "reni";
				stack.value[2]= "iksan";
				stack.value[3]= "RIFAI";
				stack.value[4]= "RIFAI";
				stack.value[5]= "RIFAI";
				stack.value[6]= "RIFAI";
				stack.value[7]= "RIFAI";
				stack.value[8]= "RIFAI";
				stack.value[9]= "RIFAI";
				stack.value[10]= "RIFAI";
				stack.value[11]= "RIFAI";
				stack.value[12]= "RIFAI";
				stack.value[13]= "RIFAI";
				stack.value[14]= "RIFAI";
				stack.value[15]= "RIFAI";
				stack.value[16]= "RIFAI";
				stack.value[17]= "RIFAI";
				stack.value[18]= "RIFAI";
				stack.value[19]= "RIFAI";
				stack.value[20]= "RIFAI";
				stack.value[21]= "RIFAI";
				stack.value[22]= "RIFAI";
				stack.value[23]= "RIFAI";
				stack.value[24]= "RIFAI";
				stack.value[25]= "RIFAI";
				stack.value[26]= "RIFAI";
				stack.value[27]= "RIFAI";
				stack.value[28]= "RIFAI";
				stack.value[29]= "RIFAI";
				stack.value[30]= "RIFAI";
				stack.value[31]= "RIFAI";
				stack.value[32]= "RIFAI";
				stack.value[33]= "RIFAI";
				stack.value[34]= "RIFAI";
				stack.value[35]= "RIFAI";
				stack.value[36]= "RIFAI";
				stack.value[37]= "RIFAI";
				stack.value[38]= "RIFAI";
				stack.value[39]= "RIFAI";
				stack.value[40]= "RIFAI";
				stack.value[41]= "RIFAI";
				stack.value[42]= "RIFAI";
				stack.value[43]= "RIFAI";
				stack.value[44]= "RIFAI";
				stack.value[45]= "RIFAI";
				stack.value[46]= "RIFAI";
				stack.value[47]= "RIFAI";
				stack.value[48]= "RIFAI";
				stack.value[49]= "RIFAI";
				stack.value[50]= "RIFAI";
				stack.value[51]= "RIFAI";
				stack.value[52]= "RIFAI";
				stack.value[53]= "RIFAI";
				stack.value[54]= "RIFAI";
				stack.value[55]= "RIFAI";
				stack.value[56]= "RIFAI";
				stack.value[57]= "RIFAI";
				stack.value[58]= "RIFAI";
				stack.value[59]= "RIFAI";
				stack.value[60]= "RIFAI";
				stack.value[61]= "RIFAI";
				stack.value[62]= "RIFAI";
				stack.value[63]= "RIFAI";
				stack.value[64]= "RIFAI";
				stack.value[65]= "RIFAI";
				stack.value[66]= "RIFAI";
				stack.value[67]= "RIFAI";
				stack.value[68]= "RIFAI";
				stack.value[69]= "RIFAI";
				stack.value[70]= "RIFAI";
				stack.value[71]= "RIFAI";
				stack.value[72]= "RIFAI";
				stack.value[73]= "RIFAI";
				stack.value[74]= "RIFAI";
				stack.value[75]= "RIFAI";
				stack.value[76]= "RIFAI";
				stack.value[77]= "RIFAI";
				stack.value[78]= "RIFAI";
				stack.value[79]= "RIFAI";
				stack.value[80]= "RIFAI";
				stack.value[81]= "RIFAI";
				stack.value[82]= "RIFAI";
				stack.value[83]= "RIFAI";
				stack.value[84]= "RIFAI";
				stack.value[85]= "RIFAI";
				stack.value[86]= "RIFAI";
				stack.value[87]= "RIFAI";
				stack.value[88]= "RIFAI";
				stack.value[89]= "RIFAI";
				stack.value[90]= "RIFAI";
				stack.value[91]= "RIFAI";
				stack.value[92]= "RIFAI";
				stack.value[93]= "RIFAI";
				stack.value[94]= "RIFAI";
				stack.value[95]= "RIFAI";
				stack.value[96]= "RIFAI";
				stack.value[97]= "RIFAI";
				stack.value[98]= "RIFAI";
				stack.value[99]= "RIFAI";
				for(int i=0;i <stack.value.length;i++){System.out.println(stack.value[i]);};
			}

	}

}
