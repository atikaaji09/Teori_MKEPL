package Assignment;

// Enum untuk Genre
enum Genre {
    UNDEFINED, POP, ROCK, HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE;
}

// Kelas untuk Artist
class Artist {

    private String name;
    private String alias;
    private String imageUrl;

    public Artist(String name, String alias, String imageUrl) {
        this.name = name;
        this.alias = alias;
        this.imageUrl = imageUrl;
    }

    public String getArtistInfo() {
        return "Artist: " + name + (alias.isEmpty() ? "" : " (AKA: " + alias + ")");
    }
}

// Kelas untuk Album
class Album {

    private String name;
    private String coverUrl;

    public Album(String name, String coverUrl) {
        this.name = name;
        this.coverUrl = coverUrl;
    }

    public String getAlbumInfo() {
        return "Album: " + name;
    }
}

// Kelas Song setelah refactoring
public class Song {

    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    private Genre genre;
    private Album album;
    private Artist artist;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
        this.genre = Genre.UNDEFINED;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void printInfo(int detailLevel) {
        System.out.println("Song Title: " + title);
        System.out.println("Release Year: " + releaseYear);
        if (genre != Genre.UNDEFINED) {
            System.out.println("Genre: " + genre);
        }
        if (detailLevel >= 1 && artist != null) {
            System.out.println(artist.getArtistInfo());
        }
        if (detailLevel >= 2 && album != null) {
            System.out.println(album.getAlbumInfo());
        }
    }

    public static void main(String[] args) {
        Song song = new Song("1", "Love Story", "2008", "https://musicurl.com/lovestory");
        song.setGenre(Genre.POP);
        song.setArtist(new Artist("Taylor Swift", "", "https://artisturl.com/taylor"));
        song.setAlbum(new Album("Fearless", "https://coverurl.com/fearless"));

        song.printInfo(3);
    }
}
