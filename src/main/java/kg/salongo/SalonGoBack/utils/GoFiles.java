package kg.salongo.SalonGoBack.utils;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class GoFiles {

    public static final String storage = "G:/salonGoFiles/";
    public static final String serviceImagesStorage = storage + "service_images/";

    public static String save(MultipartFile file) throws Exception {
        return save(file, storage);
    }

    public static String save(MultipartFile file, String path) throws Exception {
        Path storagePath = Paths.get(path);
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        String fileExtension = getFileExtension(filename);
        filename = RandomUtils.randomString(20) + fileExtension;
        try {
            if (file.isEmpty()) {
                throw new Exception("Failed to store empty file " + filename);
            }
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, storagePath.resolve(filename),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (Exception e) {
            throw new Exception("Failed to store file " + filename, e);
        }
        return filename;
    }

    public static Resource loadAsResource(String filename, String path) throws Exception {
        try {
            Path file = Paths.get(path).resolve(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new Exception(
                        "Could not read file: " + filename);

            }
        } catch (Exception e) {
            throw new Exception("Could not read file: " + filename, e);
        }
    }

    public static String getFileExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        return fileName.substring(dotIndex);
    }
}
