package hello.upload.domain;

import lombok.Data;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/02/06
 */
@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;

    public UploadFile(final String uploadFileName, final String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }

}
