package com.itjiayan.beiwanglu;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.itjiayan.model.Note;
import com.itjiayan.service.INoteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeiwangluApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    INoteService noteService;

    @Test
    public void find(){
        Page<Note> page = new Page<>(0, 10);

        Page<Note> notePage = noteService.selectPage(page, new EntityWrapper<Note>().eq("record_status", "0"));
        String s = notePage.getRecords().toString();
        System.out.println(s);
/*
        Note note = new Note();
        note.setId(44);
        note.setRecordStatus("1");
        noteService.updateById(note);*/
    }

    public static void main(String[] args) {

    }
}
