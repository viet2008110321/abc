package abc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Sapxep {
	static ArrayList<HangHoa> sapxepgianhaptangdan(ArrayList<HangHoa> dsHangHoa) {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			public int compare(HangHoa o1, HangHoa o2) {
				return Double.compare(o1.gianhap, o2.gianhap);
			}

		});
		return dsHangHoa;

	}

	static ArrayList<HangHoa> sapxepgianhapgiamdan(ArrayList<HangHoa> dsHangHoa) {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			public int compare(HangHoa o1, HangHoa o2) {
				return Double.compare(o2.gianhap, o1.gianhap);
			}

		});

		return dsHangHoa;
	}

	static ArrayList<HangHoa> sapxepngaynhaptangdan(ArrayList<HangHoa> dsHangHoa) {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			public int compare(HangHoa s1, HangHoa s2) {
				Date ngaynhapkhoS1 = chuyendoingay(s1.ngaynhapkho);
				Date ngaynhapkhos2 = chuyendoingay(s2.ngaynhapkho);
				if (ngaynhapkhoS1 == null || ngaynhapkhos2 == null) {
					return 0;
				}

				return ngaynhapkhoS1.compareTo(ngaynhapkhos2);
			}

		});

		return dsHangHoa;
	}

	static ArrayList<HangHoa> sapxepngaynhapgiamdan(ArrayList<HangHoa> dsHangHoa) {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			public int compare(HangHoa s1, HangHoa s2) {
				Date ngaynhapkhoS1 = chuyendoingay(s1.ngaynhapkho);
				Date ngaynhapkhos2 = chuyendoingay(s2.ngaynhapkho);
				if (ngaynhapkhoS1 == null || ngaynhapkhos2 == null) {
					return 0;
				}

				return ngaynhapkhos2.compareTo(ngaynhapkhoS1);
			}

		});

		return dsHangHoa;
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
