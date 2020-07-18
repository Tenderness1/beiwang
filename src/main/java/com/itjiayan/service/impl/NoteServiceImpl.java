package com.itjiayan.service.impl;

import com.itjiayan.model.Note;
import com.itjiayan.mapper.NoteMapper;
import com.itjiayan.service.INoteService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fanwenyan
 * @since 2020-07-18
 */
@Service
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note> implements INoteService {

}
