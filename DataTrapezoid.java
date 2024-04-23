package uts;

public class DataTrapezoid {
    public double BBase;
    public double Base;
    public double Height;
    public String sisi1;
    public String sisi2;
    public String sisi3;



    public DataTrapezoid() {
            this.Base = Double.parseDouble(sisi1);
            this.BBase = Double.parseDouble(sisi2);
            this.Height = Double.parseDouble(sisi3);

        }

        public double hitungLuas() {
            return ((this.Base + this.BBase) / 2) * this.Height;
        }

        public double hitungKeliling() {
            return this.Base + this.BBase + this.Height;
        }
    }
//    public int Base;
//    public int Height;
//    public int BBase;


