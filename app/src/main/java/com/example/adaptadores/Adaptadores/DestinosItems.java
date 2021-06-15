package com.example.adaptadores.Adaptadores;

import com.example.adaptadores.R;

import java.util.ArrayList;
import java.util.List;

public class DestinosItems {
    // declaro el arreglo
    private static final List<agenciasItems> ITEMS = new ArrayList<agenciasItems>();
    //contenido del arreglo
    static {
        addItem(new DestinosItems.agenciasItems ("1","TaytaIntiTours", R.drawable.destinouno,"aventura"));
        addItem(new DestinosItems.agenciasItems("2","MachuppicchuAgency",R.drawable.destinodos,"aventura"));
        addItem(new DestinosItems.agenciasItems("3","Amaru", R.drawable.destinotres,"aventura"));
        addItem(new DestinosItems.agenciasItems("4","Viajes", R.drawable.destinocuatro,"aventura"));
        addItem(new DestinosItems.agenciasItems("5","ViajesCusco", R.drawable.destinocinco,"aventura"));
    }
    //metodo que contruye el arreglo , metodo principal
    static void addItem(DestinosItems.agenciasItems item){
        ITEMS.add(item);
    }
    // metodo para agregar objetos
    public static ArrayList<DestinosItems.agenciasItems> ArregloLista (){
        ArrayList<DestinosItems.agenciasItems> d = new ArrayList<DestinosItems.agenciasItems>();
        for(DestinosItems.agenciasItems obj:ITEMS){
            d.add(obj);
        }
        return d;
    }
    // metodo para traer datos
    public static DestinosItems.agenciasItems getDestinosItems(String id){
        for(DestinosItems.agenciasItems obj:ITEMS){
            if (obj.id.equals(id)){
                return obj;
            }
        }
        return ITEMS.get(1); // busqueda título
    }
    // crear arreglo
    public static class agenciasItems {

        private String id;
        private String titulo;
        private Integer imagen;
        private String tipoTurismo;

        public agenciasItems(String id,String titulo,Integer imagen,String tipoTurismo){
            this.id = id;
            this.titulo = titulo;
            this.imagen = imagen;
            this.tipoTurismo = tipoTurismo;
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Integer getImagen() {
            return imagen;
        }

        public void setImagen(Integer imagen) {
            this.imagen = imagen;
        }

        public String getTipoTurismo() {
            return tipoTurismo;
        }

        public void setTipoTurismo(String tipoTurismo) {
            this.tipoTurismo = tipoTurismo;
        }
    }
}
