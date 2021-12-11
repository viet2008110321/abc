package abc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TimKiem {

	static HangHoa timhanghoatheoten(String tenHangHoa, ArrayList<HangHoa> dsHangHoa) {
		for (HangHoa hangHoa : dsHangHoa)
			if (hangHoa.tenhanghoa.toLowerCase().equals(tenHangHoa.toLowerCase()))
				return hangHoa;
		return null;
	}

	static ArrayList<HangHoa> timhanghoatheoloai(String loai, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i).loai.toLowerCase().equals(loai.toLowerCase())) {
				result.add(dsHangHoa.get(i));
			}

		}

		return result;
	}

	static ArrayList<HangHoa> timhanghoatheogia(double gianhap, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i).gianhap == (gianhap)) {
				result.add(dsHangHoa.get(i));
			}

		}
		return result;
	}

	static ArrayList<HangHoa> timhanghoatheongay(String ngaynhapkho, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i).ngaynhapkho.equals(ngaynhapkho)) {
				result.add(dsHangHoa.get(i));

			}
		}
		return result;

	}

	static HangHoa timhanghoatheoma(String mahang, ArrayList<HangHoa> dsHangHoa) {
		HangHoa result = null;
		for (HangHoa hangHoa : dsHangHoa) {

			if (hangHoa.mahang.toLowerCase().equals(mahang.toLowerCase())) {
				result = hangHoa;
				break;
			}
		}
		return result;
	}

	static ArrayList<HangHoa> timhanghoatheokhoanggia(Double giabatdau, double giaketthuc,
			ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (HangHoa hangHoa : dsHangHoa) {
			double gianhapkho = hangHoa.gianhap;
			double giadau = (giabatdau);
			double giacuoi = (giaketthuc);
			if ((gianhapkho >= (giadau)) && gianhapkho <= (giacuoi)) {
				result.add(hangHoa);
			}
		}
		return result;
	}

	static ArrayList<HangHoa> timhanghoatheokhoangngay(String ngaydau, String ngaycuoi, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (HangHoa hangHoa : dsHangHoa) {
			Date ngaynhapkho = chuyendoingay(hangHoa.ngaynhapkho);
			Date ngaybatdau = chuyendoingay(ngaydau);
			Date ngayketthuc = chuyendoingay(ngaycuoi);

			if (ngaynhapkho == null) {
				break;
			}

			if (ngaybatdau == null) {
				break;
			}

			if (ngayketthuc == null) {
				break;
			}

			if ((ngaynhapkho.equals(ngaybatdau) || ngaynhapkho.after(ngaybatdau))
					&& (ngaynhapkho.before(ngayketthuc) || ngaynhapkho.equals(ngayketthuc))) {
				result.add(hangHoa);
			}
		}
		return result;

	}

	// 22/11/2021
	private static Date chuyendoingay(String ngaynhap) {
		SimpleDateFormat simpledate = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return simpledate.parse(ngaynhap);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
