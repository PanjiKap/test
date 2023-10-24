public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 10, 30, 40, 50};
        int sum = 0; // Inisialisasi sum ke 0

        for (int i = 0; i < numbers.length; i++) { // Perbaiki kondisi loop
            sum += numbers[i]; // Perbaiki penulisan numbers
        }

        double average = (double) sum / numbers.length; // Ubah salah satu operan menjadi double
        System.out.println("Rata-rata: " + average);
    }
}