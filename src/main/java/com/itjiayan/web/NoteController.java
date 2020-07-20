package com.itjiayan.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.itjiayan.model.Note;
import com.itjiayan.model.NoteVO;
import com.itjiayan.model.PageVO;
import com.itjiayan.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fanwenyan
 * @since 2020-07-18
 */
@Controller
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class NoteController {


    @Autowired
    private INoteService noteService;

    @GetMapping("/getNote")
    @ResponseBody
    public List<Note> getUser(){
        Note note = noteService.selectById(1);
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(note);
        return notes;
    }
    @RequestMapping("/index")
    public String toIndex(){

        return "note";
    }


    @GetMapping("/")
    public String indexPage() {
        return "note";
    }

    @PostMapping("/page")
    @ResponseBody
    public ResponseEntity<Object> findPageAll(@RequestBody PageVO pageVO) {

        NoteVO noteVO = new NoteVO();
        Page<Note> page = new Page<>(pageVO.getStart(), pageVO.getLength());
        Page<Note> notePage = noteService.selectPage(page, new EntityWrapper<Note>().eq("record_status","0"));
        noteVO.setCurrent(notePage.getCurrent());
        noteVO.setSize((int) notePage.getPages());
        noteVO.setTotal(notePage.getTotal());
        noteVO.setNoteList(notePage.getRecords());

        return new ResponseEntity<Object>(noteVO, HttpStatus.OK);
    }


    @PostMapping("/addCrud")
    @ResponseBody
    public ResponseEntity<Object> addCrud(@RequestBody Note note) {

        if (note != null) {
            noteService.insert(note);
            return new ResponseEntity<Object>("添加成功", HttpStatus.OK);
        }
        return new ResponseEntity<Object>("添加失败", HttpStatus.OK);

    }

    @DeleteMapping("/crud/{id}")
    @ResponseBody
    public ResponseEntity<Object> deleteById(@PathVariable("id") Integer id) {
        if (id.equals("")) {
            return new ResponseEntity<Object>("id不能为空", HttpStatus.NOT_FOUND);
        }
        Note note = new Note();
        note.setId(id);
        note.setRecordStatus("1");
        noteService.updateById(note);
        return new ResponseEntity<Object>("删除成功", HttpStatus.OK);
    }


    @PutMapping("/updateUser")
    @ResponseBody
    public ResponseEntity<Object> updateById(@RequestBody Note note) {

        if (note != null) {
            noteService.insertOrUpdate(note);
            return new ResponseEntity<Object>("编辑成功", HttpStatus.OK);
        }
        return new ResponseEntity<Object>("编辑失败", HttpStatus.OK);

    }
}
