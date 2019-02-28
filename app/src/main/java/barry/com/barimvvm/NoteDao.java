package barry.com.barimvvm;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * 1 dao per entity
 */
@Dao
public interface NoteDao {
    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM table_note")
    void deleteAllNotes();

    @Query("SELECT * FROM table_note ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
}
