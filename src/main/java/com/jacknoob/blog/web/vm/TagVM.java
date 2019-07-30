package com.jacknoob.blog.web.vm;

import com.jacknoob.blog.entity.Note;

import java.util.List;

/**
 * @author JackJun
 * 2019/7/30 15:01
 * Life is just about survival.
 */
public class TagVM {
    private String tagName;
    private List<Note> note;

    public TagVM(String tagName, List<Note> note) {
        this.tagName = tagName;
        this.note = note;
    }

    public TagVM() {
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }
}
