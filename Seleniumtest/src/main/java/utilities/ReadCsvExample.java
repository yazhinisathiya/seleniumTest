package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvExample {

public Object[][] ReadCsv() throws IOException {
		
		String csvFile = "ReadCsv.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        List<Object[]> data = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(cvsSplitBy);
                data.add(rowData);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }

        return data.toArray(new Object[0][]);

	}
}
