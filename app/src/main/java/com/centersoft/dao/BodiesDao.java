package com.centersoft.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.centersoft.entity.Bodies.Body_typeConverter;
import com.centersoft.enums.Body_type;

import com.centersoft.entity.Bodies;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BODIES".
*/
public class BodiesDao extends AbstractDao<Bodies, String> {

    public static final String TABLENAME = "BODIES";

    /**
     * Properties of entity Bodies.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Type = new Property(0, String.class, "type", false, "TYPE");
        public final static Property Msg = new Property(1, String.class, "msg", false, "MSG");
        public final static Property Id = new Property(2, String.class, "id", true, "ID");
        public final static Property ImgUrl = new Property(3, String.class, "imgUrl", false, "IMG_URL");
        public final static Property ImageName = new Property(4, String.class, "imageName", false, "IMAGE_NAME");
    }

    private final Body_typeConverter typeConverter = new Body_typeConverter();

    public BodiesDao(DaoConfig config) {
        super(config);
    }
    
    public BodiesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BODIES\" (" + //
                "\"TYPE\" TEXT," + // 0: type
                "\"MSG\" TEXT," + // 1: msg
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 2: id
                "\"IMG_URL\" TEXT," + // 3: imgUrl
                "\"IMAGE_NAME\" TEXT);"); // 4: imageName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BODIES\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Bodies entity) {
        stmt.clearBindings();
 
        Body_type type = entity.getType();
        if (type != null) {
            stmt.bindString(1, typeConverter.convertToDatabaseValue(type));
        }
 
        String msg = entity.getMsg();
        if (msg != null) {
            stmt.bindString(2, msg);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(3, id);
        }
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(4, imgUrl);
        }
 
        String imageName = entity.getImageName();
        if (imageName != null) {
            stmt.bindString(5, imageName);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Bodies entity) {
        stmt.clearBindings();
 
        Body_type type = entity.getType();
        if (type != null) {
            stmt.bindString(1, typeConverter.convertToDatabaseValue(type));
        }
 
        String msg = entity.getMsg();
        if (msg != null) {
            stmt.bindString(2, msg);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(3, id);
        }
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(4, imgUrl);
        }
 
        String imageName = entity.getImageName();
        if (imageName != null) {
            stmt.bindString(5, imageName);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2);
    }    

    @Override
    public Bodies readEntity(Cursor cursor, int offset) {
        Bodies entity = new Bodies( //
            cursor.isNull(offset + 0) ? null : typeConverter.convertToEntityProperty(cursor.getString(offset + 0)), // type
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // msg
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // imgUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // imageName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Bodies entity, int offset) {
        entity.setType(cursor.isNull(offset + 0) ? null : typeConverter.convertToEntityProperty(cursor.getString(offset + 0)));
        entity.setMsg(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImgUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImageName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Bodies entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(Bodies entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Bodies entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}