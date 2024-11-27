package com.noteapp.notely.note;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notes/")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping
    // @CrossOrigin(origins = "http://localhost:4000/")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("{id}/")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    @PostMapping
    public Note createNote(@RequestBody Note note){
        return noteService.saveNote(note);
    }

    @PutMapping("{id}/")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
        return noteService.updateNote(id, note);
    }

    @DeleteMapping("{id}/")
    public void deleteNoteById(@PathVariable Long id){
        noteService.deleteNoteById(id);
    }
}

