package com.noteapp.notely.note;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public Note updateNote(Long id, Note updateNote) {
        Note note = getNoteById(id);
        if (note != null) {
            note.setTitle(updateNote.getTitle());
            note.setContent(updateNote.getContent());
        }
        return noteRepository.save(updateNote);
    }

    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }
}

