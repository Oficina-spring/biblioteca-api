package UUID;

import java.util.UUID;

public class UuidAleatorioImpl implements UuidAleatorio {

    public UUID geradorUuid() {
        return UUID.randomUUID();
    }

}
