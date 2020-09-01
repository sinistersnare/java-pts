package extractor;

import java.io.IOException;

public interface Database {
    void register(String predicate);

    void add(String predicate, Column arg);

    void add(String predicate, Column arg1, Column arg2);

    void add(String predicate, Column arg1, Column arg2, Column arg3);

    void add(String predicate, Column arg1, Column arg2, Column arg3, Column arg4);

    Column addEntity(String string, String key);

    Column asColumn(String arg);

    Column asIntColumn(String arg);

    Column asEntity(String arg);

    void close() throws IOException;

}
