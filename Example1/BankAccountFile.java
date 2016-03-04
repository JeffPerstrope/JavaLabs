/**
 * Created by Jeff on 2/24/2016.
 */

import java.io.*;

public class BankAccountFile {

    private final int RECORD_SIZE = 16;//  8  8
    private RandomAccessFile randomFile;

    public BankAccountFile() throws FileNotFoundException
    {
        randomFile = new RandomAccessFile("Exercise10.dat", "rw");
    }

    public void writeBankAccount(BankAccount ba) throws IOException
    {
        randomFile.writeDouble(ba.getBalance());
        randomFile.writeDouble(ba.getInterest());
    }

    public BankAccount readBankAccount() throws IOException
    {
        double bal = randomFile.readDouble();
        double rate = randomFile.readDouble();

        BankAccount account  = new BankAccount(bal, rate);
        return account;
    }

    private long getByteNum(long recordNum)
    {
        return RECORD_SIZE * recordNum;
    }

    public void moveFilePointer(long recordNum) throws IOException
    {
        randomFile.seek(getByteNum(recordNum));
    }

    public long getNumberOfRecords() throws IOException
    {
        return randomFile.length() / RECORD_SIZE;
    }

    public void close() throws IOException
    {
        randomFile.close();
    }

}
