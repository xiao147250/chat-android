package com.hyphenate.chatuidemo.common.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.hyphenate.chatuidemo.common.db.converter.DateConverter;
import com.hyphenate.chatuidemo.common.db.dao.AppKeyDao;
import com.hyphenate.chatuidemo.common.db.dao.EmUserDao;
import com.hyphenate.chatuidemo.common.db.dao.InviteMessageDao;
import com.hyphenate.chatuidemo.common.db.dao.MsgTypeManageDao;
import com.hyphenate.chatuidemo.common.db.entity.AppKeyEntity;
import com.hyphenate.chatuidemo.common.db.entity.EmUserEntity;
import com.hyphenate.chatuidemo.common.db.entity.InviteMessage;
import com.hyphenate.chatuidemo.common.db.entity.MsgTypeManageEntity;

@Database(entities = {EmUserEntity.class,
        InviteMessage.class,
        MsgTypeManageEntity.class,
        AppKeyEntity.class},
        version = 11)
@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase {

    public abstract EmUserDao userDao();

    public abstract InviteMessageDao inviteMessageDao();

    public abstract MsgTypeManageDao msgTypeManageDao();

    public abstract AppKeyDao appKeyDao();
}
