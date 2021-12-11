package abc;

import java.util.ArrayList;

public class Thongke {
	static int thongketongsoluonghanghoa(ArrayList<HangHoa> dsHangHoa) {
		int tongsoluong = 0;
		for (HangHoa hangHoa : dsHangHoa) {
			tongsoluong = tongsoluong + hangHoa.soluongtonkho;
		}
		return tongsoluong;
	}

	static double thongketonggiatrihanghoa(ArrayList<HangHoa> dsHangHoa) {
		double tonggiatri = 0;
		for (HangHoa hangHoa : dsHangHoa) {
			tonggiatri = tonggiatri + (hangHoa.gianhap * hangHoa.soluongtonkho);
		}
		return tonggiatri;

	}

	static int thongkesoluongtungloai(String loai, ArrayList<HangHoa> dsHangHoa) {
		int tongsoluong = 0;
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa.loai.toLowerCase().equals(loai.toLowerCase())){
				tongsoluong = tongsoluong + hangHoa.soluongtonkho;
			} 
				
			
		}
		return tongsoluong;
	}
}