package storage;

import classwork.GameCenter.src.main.java.storage.IDao;
import org.jetbrains.annotations.NotNull;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;
import org.mapdb.Serializer;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Storage implements IDao {
    private DB db = null;
    private File data = null;
    private HTreeMap<byte[], byte[]> storage = null;

    public Storage(File directory) {
        this.data = new File(directory, "db");
        this.db = DBMaker.fileDB(data).fileChannelEnable().fileMmapEnable()
                .fileMmapEnableIfSupported().fileMmapPreclearDisable().make();
        this.storage = db.hashMap(data.getName())
                .keySerializer(Serializer.BYTE_ARRAY)
                .valueSerializer(Serializer.BYTE_ARRAY).createOrOpen();
    }

    @Override
    public void put(@NotNull byte[] key, @NotNull byte[] value) throws IOException {
        this.storage.put(key, value);
    }

    @NotNull
    @Override
    public byte[] get(@NotNull byte[] key) throws IOException, NoSuchElementException {
        byte[] out;
        out = storage.get(key);
        if (out == null) {
            throw new NoSuchElementException();
        }
        return out;
    }

    @Override
    public void remote(@NotNull byte[] key) throws IOException, NoSuchElementException {
        this.storage.remove(key);
    }

    @Override
    public void close() throws IOException {
        db.close();
    }

}