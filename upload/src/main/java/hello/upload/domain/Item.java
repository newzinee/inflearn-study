package hello.upload.domain;

import lombok.Data;

import java.util.List;

/**
 * @author yjjung
 * @version 0.1.0
 * @since 2022/02/06
 */
@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;
}
