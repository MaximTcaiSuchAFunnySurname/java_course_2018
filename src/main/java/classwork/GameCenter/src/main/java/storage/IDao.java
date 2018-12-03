package storage;

import org.jetbrains.annotations.NotNull;

import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;

public interface IDao extends Closeable {
    public void put(@NotNull byte[] key, @NotNull byte[] value) throws IOException;

    @NotNull
    public byte[] get(@NotNull byte[] key) throws IOException, NoSuchElementException;

    public void remote(@NotNull byte[] key) throws IOException, NoSuchElementException;

}