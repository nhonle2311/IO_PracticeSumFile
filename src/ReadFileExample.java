import javax.imageio.IIOException;
import java.io.*;

public class ReadFileExample {
    public void readFileexample(String numbers){
        try {
//            đọc file
            File file = new File(numbers);
//            kiểm tra file có tồn tại không
            if (!file.exists()){
                throw new FileNotFoundException();
            }
//            đọc từng dòng của file và cộng tổng lại
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line=bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
//      hiển thị ra màng hình tổng các số nguyên trong file
            System.out.println(sum);
        }catch (IIOException e){
            System.out.println(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
