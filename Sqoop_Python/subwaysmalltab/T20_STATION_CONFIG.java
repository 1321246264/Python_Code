// ORM class for table 'T20_STATION_CONFIG'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jun 29 16:47:40 CST 2020
// For connector: com.cloudera.connector.teradata.TeradataManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class T20_STATION_CONFIG extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Station_ID = (String)value;
      }
    });
    setters.put("App_Scene_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.App_Scene_Cd = (String)value;
      }
    });
    setters.put("Line_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Line_ID = (String)value;
      }
    });
    setters.put("Station_Nme", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Station_Nme = (String)value;
      }
    });
    setters.put("Station_Des", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Station_Des = (String)value;
      }
    });
    setters.put("ACC_Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.ACC_Station_ID = (String)value;
      }
    });
    setters.put("Term_Station_Ind", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Term_Station_Ind = (Integer)value;
      }
    });
    setters.put("Xfer_Station_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Xfer_Station_ID = (String)value;
      }
    });
    setters.put("Station_Open_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Station_Open_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Station_Close_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Station_Close_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Station_Seq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Station_Seq = (Integer)value;
      }
    });
    setters.put("Source_Sys_Cd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Source_Sys_Cd = (String)value;
      }
    });
    setters.put("Data_Dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Data_Dt = (java.sql.Date)value;
      }
    });
    setters.put("Enable_Flag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        T20_STATION_CONFIG.this.Enable_Flag = (Integer)value;
      }
    });
  }
  public T20_STATION_CONFIG() {
    init0();
  }
  private String Station_ID;
  public String get_Station_ID() {
    return Station_ID;
  }
  public void set_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
  }
  public T20_STATION_CONFIG with_Station_ID(String Station_ID) {
    this.Station_ID = Station_ID;
    return this;
  }
  private String App_Scene_Cd;
  public String get_App_Scene_Cd() {
    return App_Scene_Cd;
  }
  public void set_App_Scene_Cd(String App_Scene_Cd) {
    this.App_Scene_Cd = App_Scene_Cd;
  }
  public T20_STATION_CONFIG with_App_Scene_Cd(String App_Scene_Cd) {
    this.App_Scene_Cd = App_Scene_Cd;
    return this;
  }
  private String Line_ID;
  public String get_Line_ID() {
    return Line_ID;
  }
  public void set_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
  }
  public T20_STATION_CONFIG with_Line_ID(String Line_ID) {
    this.Line_ID = Line_ID;
    return this;
  }
  private String Station_Nme;
  public String get_Station_Nme() {
    return Station_Nme;
  }
  public void set_Station_Nme(String Station_Nme) {
    this.Station_Nme = Station_Nme;
  }
  public T20_STATION_CONFIG with_Station_Nme(String Station_Nme) {
    this.Station_Nme = Station_Nme;
    return this;
  }
  private String Station_Des;
  public String get_Station_Des() {
    return Station_Des;
  }
  public void set_Station_Des(String Station_Des) {
    this.Station_Des = Station_Des;
  }
  public T20_STATION_CONFIG with_Station_Des(String Station_Des) {
    this.Station_Des = Station_Des;
    return this;
  }
  private String ACC_Station_ID;
  public String get_ACC_Station_ID() {
    return ACC_Station_ID;
  }
  public void set_ACC_Station_ID(String ACC_Station_ID) {
    this.ACC_Station_ID = ACC_Station_ID;
  }
  public T20_STATION_CONFIG with_ACC_Station_ID(String ACC_Station_ID) {
    this.ACC_Station_ID = ACC_Station_ID;
    return this;
  }
  private Integer Term_Station_Ind;
  public Integer get_Term_Station_Ind() {
    return Term_Station_Ind;
  }
  public void set_Term_Station_Ind(Integer Term_Station_Ind) {
    this.Term_Station_Ind = Term_Station_Ind;
  }
  public T20_STATION_CONFIG with_Term_Station_Ind(Integer Term_Station_Ind) {
    this.Term_Station_Ind = Term_Station_Ind;
    return this;
  }
  private String Xfer_Station_ID;
  public String get_Xfer_Station_ID() {
    return Xfer_Station_ID;
  }
  public void set_Xfer_Station_ID(String Xfer_Station_ID) {
    this.Xfer_Station_ID = Xfer_Station_ID;
  }
  public T20_STATION_CONFIG with_Xfer_Station_ID(String Xfer_Station_ID) {
    this.Xfer_Station_ID = Xfer_Station_ID;
    return this;
  }
  private java.sql.Date Station_Open_Dt;
  public java.sql.Date get_Station_Open_Dt() {
    return Station_Open_Dt;
  }
  public void set_Station_Open_Dt(java.sql.Date Station_Open_Dt) {
    this.Station_Open_Dt = Station_Open_Dt;
  }
  public T20_STATION_CONFIG with_Station_Open_Dt(java.sql.Date Station_Open_Dt) {
    this.Station_Open_Dt = Station_Open_Dt;
    return this;
  }
  private java.sql.Date Station_Close_Dt;
  public java.sql.Date get_Station_Close_Dt() {
    return Station_Close_Dt;
  }
  public void set_Station_Close_Dt(java.sql.Date Station_Close_Dt) {
    this.Station_Close_Dt = Station_Close_Dt;
  }
  public T20_STATION_CONFIG with_Station_Close_Dt(java.sql.Date Station_Close_Dt) {
    this.Station_Close_Dt = Station_Close_Dt;
    return this;
  }
  private Integer Station_Seq;
  public Integer get_Station_Seq() {
    return Station_Seq;
  }
  public void set_Station_Seq(Integer Station_Seq) {
    this.Station_Seq = Station_Seq;
  }
  public T20_STATION_CONFIG with_Station_Seq(Integer Station_Seq) {
    this.Station_Seq = Station_Seq;
    return this;
  }
  private String Source_Sys_Cd;
  public String get_Source_Sys_Cd() {
    return Source_Sys_Cd;
  }
  public void set_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
  }
  public T20_STATION_CONFIG with_Source_Sys_Cd(String Source_Sys_Cd) {
    this.Source_Sys_Cd = Source_Sys_Cd;
    return this;
  }
  private java.sql.Date Data_Dt;
  public java.sql.Date get_Data_Dt() {
    return Data_Dt;
  }
  public void set_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
  }
  public T20_STATION_CONFIG with_Data_Dt(java.sql.Date Data_Dt) {
    this.Data_Dt = Data_Dt;
    return this;
  }
  private Integer Enable_Flag;
  public Integer get_Enable_Flag() {
    return Enable_Flag;
  }
  public void set_Enable_Flag(Integer Enable_Flag) {
    this.Enable_Flag = Enable_Flag;
  }
  public T20_STATION_CONFIG with_Enable_Flag(Integer Enable_Flag) {
    this.Enable_Flag = Enable_Flag;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T20_STATION_CONFIG)) {
      return false;
    }
    T20_STATION_CONFIG that = (T20_STATION_CONFIG) o;
    boolean equal = true;
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.App_Scene_Cd == null ? that.App_Scene_Cd == null : this.App_Scene_Cd.equals(that.App_Scene_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Station_Nme == null ? that.Station_Nme == null : this.Station_Nme.equals(that.Station_Nme));
    equal = equal && (this.Station_Des == null ? that.Station_Des == null : this.Station_Des.equals(that.Station_Des));
    equal = equal && (this.ACC_Station_ID == null ? that.ACC_Station_ID == null : this.ACC_Station_ID.equals(that.ACC_Station_ID));
    equal = equal && (this.Term_Station_Ind == null ? that.Term_Station_Ind == null : this.Term_Station_Ind.equals(that.Term_Station_Ind));
    equal = equal && (this.Xfer_Station_ID == null ? that.Xfer_Station_ID == null : this.Xfer_Station_ID.equals(that.Xfer_Station_ID));
    equal = equal && (this.Station_Open_Dt == null ? that.Station_Open_Dt == null : this.Station_Open_Dt.equals(that.Station_Open_Dt));
    equal = equal && (this.Station_Close_Dt == null ? that.Station_Close_Dt == null : this.Station_Close_Dt.equals(that.Station_Close_Dt));
    equal = equal && (this.Station_Seq == null ? that.Station_Seq == null : this.Station_Seq.equals(that.Station_Seq));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Enable_Flag == null ? that.Enable_Flag == null : this.Enable_Flag.equals(that.Enable_Flag));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T20_STATION_CONFIG)) {
      return false;
    }
    T20_STATION_CONFIG that = (T20_STATION_CONFIG) o;
    boolean equal = true;
    equal = equal && (this.Station_ID == null ? that.Station_ID == null : this.Station_ID.equals(that.Station_ID));
    equal = equal && (this.App_Scene_Cd == null ? that.App_Scene_Cd == null : this.App_Scene_Cd.equals(that.App_Scene_Cd));
    equal = equal && (this.Line_ID == null ? that.Line_ID == null : this.Line_ID.equals(that.Line_ID));
    equal = equal && (this.Station_Nme == null ? that.Station_Nme == null : this.Station_Nme.equals(that.Station_Nme));
    equal = equal && (this.Station_Des == null ? that.Station_Des == null : this.Station_Des.equals(that.Station_Des));
    equal = equal && (this.ACC_Station_ID == null ? that.ACC_Station_ID == null : this.ACC_Station_ID.equals(that.ACC_Station_ID));
    equal = equal && (this.Term_Station_Ind == null ? that.Term_Station_Ind == null : this.Term_Station_Ind.equals(that.Term_Station_Ind));
    equal = equal && (this.Xfer_Station_ID == null ? that.Xfer_Station_ID == null : this.Xfer_Station_ID.equals(that.Xfer_Station_ID));
    equal = equal && (this.Station_Open_Dt == null ? that.Station_Open_Dt == null : this.Station_Open_Dt.equals(that.Station_Open_Dt));
    equal = equal && (this.Station_Close_Dt == null ? that.Station_Close_Dt == null : this.Station_Close_Dt.equals(that.Station_Close_Dt));
    equal = equal && (this.Station_Seq == null ? that.Station_Seq == null : this.Station_Seq.equals(that.Station_Seq));
    equal = equal && (this.Source_Sys_Cd == null ? that.Source_Sys_Cd == null : this.Source_Sys_Cd.equals(that.Source_Sys_Cd));
    equal = equal && (this.Data_Dt == null ? that.Data_Dt == null : this.Data_Dt.equals(that.Data_Dt));
    equal = equal && (this.Enable_Flag == null ? that.Enable_Flag == null : this.Enable_Flag.equals(that.Enable_Flag));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Station_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.App_Scene_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Station_Nme = JdbcWritableBridge.readString(4, __dbResults);
    this.Station_Des = JdbcWritableBridge.readString(5, __dbResults);
    this.ACC_Station_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.Term_Station_Ind = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Xfer_Station_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.Station_Open_Dt = JdbcWritableBridge.readDate(9, __dbResults);
    this.Station_Close_Dt = JdbcWritableBridge.readDate(10, __dbResults);
    this.Station_Seq = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(12, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(13, __dbResults);
    this.Enable_Flag = JdbcWritableBridge.readInteger(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Station_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.App_Scene_Cd = JdbcWritableBridge.readString(2, __dbResults);
    this.Line_ID = JdbcWritableBridge.readString(3, __dbResults);
    this.Station_Nme = JdbcWritableBridge.readString(4, __dbResults);
    this.Station_Des = JdbcWritableBridge.readString(5, __dbResults);
    this.ACC_Station_ID = JdbcWritableBridge.readString(6, __dbResults);
    this.Term_Station_Ind = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Xfer_Station_ID = JdbcWritableBridge.readString(8, __dbResults);
    this.Station_Open_Dt = JdbcWritableBridge.readDate(9, __dbResults);
    this.Station_Close_Dt = JdbcWritableBridge.readDate(10, __dbResults);
    this.Station_Seq = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Source_Sys_Cd = JdbcWritableBridge.readString(12, __dbResults);
    this.Data_Dt = JdbcWritableBridge.readDate(13, __dbResults);
    this.Enable_Flag = JdbcWritableBridge.readInteger(14, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Station_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(App_Scene_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_Nme, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_Des, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACC_Station_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Term_Station_Ind, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(Xfer_Station_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Station_Open_Dt, 9 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Station_Close_Dt, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Station_Seq, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 13 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Enable_Flag, 14 + __off, 5, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Station_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(App_Scene_Cd, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Line_ID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_Nme, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Station_Des, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACC_Station_ID, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Term_Station_Ind, 7 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(Xfer_Station_ID, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(Station_Open_Dt, 9 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(Station_Close_Dt, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Station_Seq, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Source_Sys_Cd, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeDate(Data_Dt, 13 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(Enable_Flag, 14 + __off, 5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Station_ID = null;
    } else {
    this.Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.App_Scene_Cd = null;
    } else {
    this.App_Scene_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Line_ID = null;
    } else {
    this.Line_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Station_Nme = null;
    } else {
    this.Station_Nme = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Station_Des = null;
    } else {
    this.Station_Des = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACC_Station_ID = null;
    } else {
    this.ACC_Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Term_Station_Ind = null;
    } else {
    this.Term_Station_Ind = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Xfer_Station_ID = null;
    } else {
    this.Xfer_Station_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Station_Open_Dt = null;
    } else {
    this.Station_Open_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Station_Close_Dt = null;
    } else {
    this.Station_Close_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Station_Seq = null;
    } else {
    this.Station_Seq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Source_Sys_Cd = null;
    } else {
    this.Source_Sys_Cd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Data_Dt = null;
    } else {
    this.Data_Dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Enable_Flag = null;
    } else {
    this.Enable_Flag = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.App_Scene_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, App_Scene_Cd);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Station_Nme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_Nme);
    }
    if (null == this.Station_Des) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_Des);
    }
    if (null == this.ACC_Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACC_Station_ID);
    }
    if (null == this.Term_Station_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Term_Station_Ind);
    }
    if (null == this.Xfer_Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Xfer_Station_ID);
    }
    if (null == this.Station_Open_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Station_Open_Dt.getTime());
    }
    if (null == this.Station_Close_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Station_Close_Dt.getTime());
    }
    if (null == this.Station_Seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Station_Seq);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Enable_Flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Enable_Flag);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_ID);
    }
    if (null == this.App_Scene_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, App_Scene_Cd);
    }
    if (null == this.Line_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Line_ID);
    }
    if (null == this.Station_Nme) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_Nme);
    }
    if (null == this.Station_Des) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Station_Des);
    }
    if (null == this.ACC_Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACC_Station_ID);
    }
    if (null == this.Term_Station_Ind) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Term_Station_Ind);
    }
    if (null == this.Xfer_Station_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Xfer_Station_ID);
    }
    if (null == this.Station_Open_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Station_Open_Dt.getTime());
    }
    if (null == this.Station_Close_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Station_Close_Dt.getTime());
    }
    if (null == this.Station_Seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Station_Seq);
    }
    if (null == this.Source_Sys_Cd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Source_Sys_Cd);
    }
    if (null == this.Data_Dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Data_Dt.getTime());
    }
    if (null == this.Enable_Flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Enable_Flag);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(App_Scene_Cd==null?"\\N":App_Scene_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Nme==null?"\\N":Station_Nme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Des==null?"\\N":Station_Des, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACC_Station_ID==null?"\\N":ACC_Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Term_Station_Ind==null?"\\N":"" + Term_Station_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Xfer_Station_ID==null?"\\N":Xfer_Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Open_Dt==null?"\\N":"" + Station_Open_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Close_Dt==null?"\\N":"" + Station_Close_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Seq==null?"\\N":"" + Station_Seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Enable_Flag==null?"\\N":"" + Enable_Flag, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Station_ID==null?"\\N":Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(App_Scene_Cd==null?"\\N":App_Scene_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Line_ID==null?"\\N":Line_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Nme==null?"\\N":Station_Nme, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Des==null?"\\N":Station_Des, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACC_Station_ID==null?"\\N":ACC_Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Term_Station_Ind==null?"\\N":"" + Term_Station_Ind, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Xfer_Station_ID==null?"\\N":Xfer_Station_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Open_Dt==null?"\\N":"" + Station_Open_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Close_Dt==null?"\\N":"" + Station_Close_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Station_Seq==null?"\\N":"" + Station_Seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Source_Sys_Cd==null?"\\N":Source_Sys_Cd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Data_Dt==null?"\\N":"" + Data_Dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Enable_Flag==null?"\\N":"" + Enable_Flag, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.App_Scene_Cd = null; } else {
      this.App_Scene_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_Nme = null; } else {
      this.Station_Nme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_Des = null; } else {
      this.Station_Des = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ACC_Station_ID = null; } else {
      this.ACC_Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Term_Station_Ind = null; } else {
      this.Term_Station_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Xfer_Station_ID = null; } else {
      this.Xfer_Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Open_Dt = null; } else {
      this.Station_Open_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Close_Dt = null; } else {
      this.Station_Close_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Seq = null; } else {
      this.Station_Seq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Source_Sys_Cd = null; } else {
      this.Source_Sys_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Enable_Flag = null; } else {
      this.Enable_Flag = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_ID = null; } else {
      this.Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.App_Scene_Cd = null; } else {
      this.App_Scene_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Line_ID = null; } else {
      this.Line_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_Nme = null; } else {
      this.Station_Nme = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Station_Des = null; } else {
      this.Station_Des = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ACC_Station_ID = null; } else {
      this.ACC_Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Term_Station_Ind = null; } else {
      this.Term_Station_Ind = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Xfer_Station_ID = null; } else {
      this.Xfer_Station_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Open_Dt = null; } else {
      this.Station_Open_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Close_Dt = null; } else {
      this.Station_Close_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Station_Seq = null; } else {
      this.Station_Seq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Source_Sys_Cd = null; } else {
      this.Source_Sys_Cd = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Data_Dt = null; } else {
      this.Data_Dt = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Enable_Flag = null; } else {
      this.Enable_Flag = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T20_STATION_CONFIG o = (T20_STATION_CONFIG) super.clone();
    o.Station_Open_Dt = (o.Station_Open_Dt != null) ? (java.sql.Date) o.Station_Open_Dt.clone() : null;
    o.Station_Close_Dt = (o.Station_Close_Dt != null) ? (java.sql.Date) o.Station_Close_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
    return o;
  }

  public void clone0(T20_STATION_CONFIG o) throws CloneNotSupportedException {
    o.Station_Open_Dt = (o.Station_Open_Dt != null) ? (java.sql.Date) o.Station_Open_Dt.clone() : null;
    o.Station_Close_Dt = (o.Station_Close_Dt != null) ? (java.sql.Date) o.Station_Close_Dt.clone() : null;
    o.Data_Dt = (o.Data_Dt != null) ? (java.sql.Date) o.Data_Dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("App_Scene_Cd", this.App_Scene_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Station_Nme", this.Station_Nme);
    __sqoop$field_map.put("Station_Des", this.Station_Des);
    __sqoop$field_map.put("ACC_Station_ID", this.ACC_Station_ID);
    __sqoop$field_map.put("Term_Station_Ind", this.Term_Station_Ind);
    __sqoop$field_map.put("Xfer_Station_ID", this.Xfer_Station_ID);
    __sqoop$field_map.put("Station_Open_Dt", this.Station_Open_Dt);
    __sqoop$field_map.put("Station_Close_Dt", this.Station_Close_Dt);
    __sqoop$field_map.put("Station_Seq", this.Station_Seq);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Enable_Flag", this.Enable_Flag);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Station_ID", this.Station_ID);
    __sqoop$field_map.put("App_Scene_Cd", this.App_Scene_Cd);
    __sqoop$field_map.put("Line_ID", this.Line_ID);
    __sqoop$field_map.put("Station_Nme", this.Station_Nme);
    __sqoop$field_map.put("Station_Des", this.Station_Des);
    __sqoop$field_map.put("ACC_Station_ID", this.ACC_Station_ID);
    __sqoop$field_map.put("Term_Station_Ind", this.Term_Station_Ind);
    __sqoop$field_map.put("Xfer_Station_ID", this.Xfer_Station_ID);
    __sqoop$field_map.put("Station_Open_Dt", this.Station_Open_Dt);
    __sqoop$field_map.put("Station_Close_Dt", this.Station_Close_Dt);
    __sqoop$field_map.put("Station_Seq", this.Station_Seq);
    __sqoop$field_map.put("Source_Sys_Cd", this.Source_Sys_Cd);
    __sqoop$field_map.put("Data_Dt", this.Data_Dt);
    __sqoop$field_map.put("Enable_Flag", this.Enable_Flag);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
