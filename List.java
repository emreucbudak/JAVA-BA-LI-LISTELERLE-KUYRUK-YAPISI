package quelist;

public class List {
	int boyut;
	int adim;
	Bagli on;
	Bagli son;
	List(int a) {
		this.boyut = a;
		adim = 0;
		on = null;
		son = null;
	}
	void ekle(int a) {
		Bagli eleman = new Bagli();
		eleman.veri = a;
		if (adim == boyut) {
			System.out.println("Kuyruk Dolu!");
		}
		else if (on== null && son == null ) {
			on = eleman;
			son = eleman;
			System.out.println("Eklenen Eleman -> " + eleman.veri);
			adim++;
		}
		else {
			System.out.println("Eklenen Eleman -> " + eleman.veri);
			son.next = eleman;
			son = eleman;
			adim++;
		}
	}
	void yazdir() {
		Bagli ref = on;
		System.out.println("-------------------------> bas");
		while (ref!=null) {
			System.out.println("------>" +ref.veri);
			ref = ref.next;
		}
		System.out.println("<------------------------ son");
	}
	void cikar() {
		if (on == null) {
			System.out.println("Kuyruk boş!");
		}
		else {
			System.out.println("Eleman Çıkarıldı ->" + on.veri);
			on = on.next;
		}
	}
	void elemanSayisi() {
		int b = 0;
		Bagli ref2 = on;
		while(ref2!= null) {
			b++;
			ref2 = ref2.next;
		}
		System.out.println("Eleman Sayisi -> " + b);
	}
	void fullKontrol() {
		if (adim == boyut) {
			System.out.println("Kuyruk FULL DOLU!");
		}
		else {
			System.out.println("Kuyruğunda boşluk var");
		}
	}
	void bosKontrol() {
		if (on==null) {
			System.out.println("Kuyruğun boş");
		}
		else {
			System.out.println("Kuyruğunda eleman var!");
		}
	}
}
