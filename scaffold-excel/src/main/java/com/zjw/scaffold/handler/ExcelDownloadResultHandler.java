package com.zjw.scaffold.handler;

import com.zjw.scaffold.converter.DataConverter;
import com.zjw.scaffold.writer.DataWriter;
import com.zjw.scaffold.writer.ExcelDataWriter;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;

/**
 * @program scaffold
 * @description:
 * @author: zhuangjiewei
 * @create: 2019/04/20 10:58
 */
public class ExcelDownloadResultHandler<T> extends ExportResultHandler<T,ResponseEntity<FileSystemResource>>{


    public ExcelDownloadResultHandler(DataConverter<T> converter, DataWriter<ResponseEntity<FileSystemResource>> writer) {
        super(converter, writer);
    }

    public static <T> ExcelDownloadResultHandler create(DataConverter<T> converter) {

        DataWriter<ResponseEntity<FileSystemResource>> writer = new ExcelDataWriter();
        return new ExcelDownloadResultHandler(converter, writer);
    }
}
