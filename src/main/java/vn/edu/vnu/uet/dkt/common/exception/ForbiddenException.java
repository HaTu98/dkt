package vn.edu.vnu.uet.dkt.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForbiddenException extends BaseException {
    private static final long serialVersionUID = 1L;
    private final int code = 403;
    private String message = "Forbidden!";
}
