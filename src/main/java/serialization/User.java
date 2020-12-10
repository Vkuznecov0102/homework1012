package serialization;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class User implements Serializable {
    private final String login;
    private final transient String password;
    private static final long SerialVersionUID = -5178164938409020613L;
}
