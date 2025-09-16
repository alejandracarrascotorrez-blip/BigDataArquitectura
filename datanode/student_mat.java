// ORM class for table 'student_mat'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Sep 11 01:13:10 UTC 2025
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
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

public class student_mat extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = (String)value;
      }
    });
  }
  public student_mat() {
    init0();
  }
  private String famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3;
  public String get_famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3() {
    return famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3;
  }
  public void set_famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3(String famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3) {
    this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3;
  }
  public student_mat with_famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3(String famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3) {
    this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student_mat)) {
      return false;
    }
    student_mat that = (student_mat) o;
    boolean equal = true;
    equal = equal && (this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 == null ? that.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 == null : this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3.equals(that.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student_mat)) {
      return false;
    }
    student_mat that = (student_mat) o;
    boolean equal = true;
    equal = equal && (this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 == null ? that.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 == null : this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3.equals(that.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = JdbcWritableBridge.readString(1, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = JdbcWritableBridge.readString(1, __dbResults);
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
    JdbcWritableBridge.writeString(famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3, 1 + __off, 12, __dbStmt);
    return 1;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3, 1 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = null;
    } else {
    this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3==null?"null":famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3==null?"null":famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = null; } else {
      this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = __cur_str;
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
    if (__cur_str.equals("null")) { this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = null; } else {
      this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    student_mat o = (student_mat) super.clone();
    return o;
  }

  public void clone0(student_mat o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3", this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3", this.famrel_freetime_goout_Dalc_Walc_health_absences_G1_G2_G3);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
