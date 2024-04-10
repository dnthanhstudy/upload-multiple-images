package thanhfb.com.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageDTO {

    private String base64;

    private String getBase64() {
        if (base64 != null) {
            return base64.split(",")[1];
        }
        return base64;
    }
}
