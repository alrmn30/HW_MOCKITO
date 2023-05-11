package ru.netology.hwmockito.domain;
public class PosterManager {

    private String[] posters = new String[0];
    int sizeOfFindLast = 5;

    public PosterManager() {
    }

    public PosterManager(int newSizeOfFindLast) {
        sizeOfFindLast = newSizeOfFindLast;
    }

    public void addPoster( String newPoster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newPoster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        String[] lastPosters = new String[sizeOfFindLast];
        for (int i = 0; i < sizeOfFindLast; i++) {
            lastPosters[i] = posters[posters.length - 1 - i];
        }
        return  lastPosters;
    }
}
