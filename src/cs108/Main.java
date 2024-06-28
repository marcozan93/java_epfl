package cs108;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {

    public static int [] byteFrequencies(String fileName) {
        // there are a max of 256 possible byte values
        int[] frequencies = new int[256];
        // try-with-resource notation
        try (InputStream stream = new FileInputStream(fileName)) {
            int input;
            while ((input = stream.read()) != -1) {
//                System.out.println(input);
                frequencies[input]++; // count the frequency of each input byte 0, 1, 2, ..., 254, 255.
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return frequencies;
    }


    public static double average(int[] freq) {
        double total = 0; // numerator
        int sampleSize = 0; // denominator
        for (int i = 0; i < freq.length; i++) {
            total += i * freq[i];
            sampleSize += freq[i];
        }
        return total/sampleSize; // average
    }

    public static double entropy(int[] freq) {
        // (entropy) H = - sum(p_i * log2(p_i))
        int sampleSize = 0;
        for (int j : freq) {
            sampleSize += j;
        }
        double entropy = 0;
        for (int j : freq) {
            double p_i = (double) j / sampleSize;
            if (p_i != 0) {
                entropy += p_i * Math.log(p_i) / Math.log(2);
            } else {
                entropy += 0;
            }
        }
        return -entropy;
    }


    public static List<String> stemPlot(int[] freq) {
        // calculate the resizing factor
        int  maxLineLen  =  0 ;
        for ( int  stem  =  0 ; stem <= freq.length / 10 ; stem += 1 ) {
            int  lineLen  =  3 ; // 3 = length of stems
            for ( int  leaf  =  0 ; leaf <= 9 ; leaf += 1 ) {
                int  i  =  10 * stem + leaf;
                if (i >= freq.length) break ;
                lineLen += freq[i];
            }
            maxLineLen = max(lineLen, maxLineLen);
        }
        double  scale  = min( 1 , 80d / maxLineLen);

        // calculation of the stem and leaves diagram (resized)
        List<String> lines = new ArrayList<>();
        for ( int  stem  =  0 ; stem <= freq.length / 10 ; stem += 1 ) {
            StringBuilder  lineBuilder  =  new  StringBuilder ();
            if (stem < 10 ) lineBuilder.append( "0" );
            lineBuilder.append(stem).append( "|" );
            for ( int  leaf  =  0 ; leaf <= 9 ; leaf += 1 ) {
                int  i  =  10 * stem + leaf;
                if (i >= freq.length) break ;
                String  leafString  = String.valueOf(leaf);
                int  leavesCount  = ( int ) (freq[i] * scale);
                lineBuilder.append(leafString.repeat(leavesCount));
            }
            lines.add(lineBuilder.toString());
        }
        return lines;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) { // I have 6 files named file0.bin, file1.bin, ..., file5.bin
            String fileName = "file" + i + ".bin"; // .bin stands for binary file
            int[] frequencies = byteFrequencies(fileName);
            System.out.println(Arrays.toString(frequencies)); // print the frequencies of each byte value
            System.out.printf("File name: %s, Entropy: %.2f, Average: %.2f%n", fileName, entropy(frequencies), average(frequencies));
            for (String line: stemPlot(frequencies)) {
                System.out.println(line);
            }

        }

    }


}
