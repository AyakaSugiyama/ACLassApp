package jp.ac.meijou.android.aclassapp;

import java.util.Map;

public class Gist {
    public Map<String,GistFile> files;

    public static class GistFile{
        public String content;
    }
}