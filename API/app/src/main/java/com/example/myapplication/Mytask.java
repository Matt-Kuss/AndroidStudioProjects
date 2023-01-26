package com.example.myapplication;

public class MyTask extends AsyncTask<String, Void, String> {

    TextView output;


    public Mytask(TextView output){
        this.output = output;
    }

    @Override protected String doInBackground(String... strings) {
        String stringURL = strings[0]) ;
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        StringBuffer buffer = null;

        try {
            URL url = new URL(stringURL);
            HttpURLConnection connection = (HttpURLConnection) url;
        }
        return null;
    }

    @Override
    protected void onPreExecute(){
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s){
        super.onPostExecute(s);
    }


}

