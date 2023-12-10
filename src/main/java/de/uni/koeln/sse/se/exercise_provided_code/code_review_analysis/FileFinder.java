package de.uni.koeln.sse.se.exercise_provided_code.code_review_analysis;


import java.io.IOException;
import java.nio.file.Path;
import java.util.List;


public interface FileFinder {

    /**
     * Finds all files in the given directories that are probably associated with the given entries and have one of the passed extensions.
     *
     * @param entry       The entry to search files for.
     * @param directories The root directories to search.
     * @param extensions  The extensions that are acceptable.
     */
    List<Path> findAssociatedFiles(BibEntry entry, List<Path> directories, List<String> extensions) throws IOException;
}
