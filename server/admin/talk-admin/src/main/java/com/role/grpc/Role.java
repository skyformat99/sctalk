// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: role.proto

package com.role.grpc;

/**
 * Protobuf type {@code com.role.grpc.Role}
 */
public  final class Role extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.role.grpc.Role)
    RoleOrBuilder {
  // Use Role.newBuilder() to construct.
  private Role(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Role() {
    roleId_ = 0;
    roleName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Role(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            roleName_ = s;
            break;
          }
          case 32: {

            roleId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.role.grpc.RoleOuterClass.internal_static_com_role_grpc_Role_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.role.grpc.RoleOuterClass.internal_static_com_role_grpc_Role_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.role.grpc.Role.class, com.role.grpc.Role.Builder.class);
  }

  public static final int ROLE_ID_FIELD_NUMBER = 4;
  private int roleId_;
  /**
   * <code>int32 role_id = 4;</code>
   */
  public int getRoleId() {
    return roleId_;
  }

  public static final int ROLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object roleName_;
  /**
   * <code>string role_name = 1;</code>
   */
  public java.lang.String getRoleName() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roleName_ = s;
      return s;
    }
  }
  /**
   * <code>string role_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRoleNameBytes() {
    java.lang.Object ref = roleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRoleNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, roleName_);
    }
    if (roleId_ != 0) {
      output.writeInt32(4, roleId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRoleNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, roleName_);
    }
    if (roleId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, roleId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.role.grpc.Role)) {
      return super.equals(obj);
    }
    com.role.grpc.Role other = (com.role.grpc.Role) obj;

    boolean result = true;
    result = result && (getRoleId()
        == other.getRoleId());
    result = result && getRoleName()
        .equals(other.getRoleName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ROLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRoleId();
    hash = (37 * hash) + ROLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoleName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.role.grpc.Role parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.role.grpc.Role parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.role.grpc.Role parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.role.grpc.Role parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.role.grpc.Role parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.role.grpc.Role parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.role.grpc.Role parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.role.grpc.Role parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.role.grpc.Role parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.role.grpc.Role parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.role.grpc.Role parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.role.grpc.Role parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.role.grpc.Role prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.role.grpc.Role}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.role.grpc.Role)
      com.role.grpc.RoleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.role.grpc.RoleOuterClass.internal_static_com_role_grpc_Role_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.role.grpc.RoleOuterClass.internal_static_com_role_grpc_Role_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.role.grpc.Role.class, com.role.grpc.Role.Builder.class);
    }

    // Construct using com.role.grpc.Role.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      roleId_ = 0;

      roleName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.role.grpc.RoleOuterClass.internal_static_com_role_grpc_Role_descriptor;
    }

    public com.role.grpc.Role getDefaultInstanceForType() {
      return com.role.grpc.Role.getDefaultInstance();
    }

    public com.role.grpc.Role build() {
      com.role.grpc.Role result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.role.grpc.Role buildPartial() {
      com.role.grpc.Role result = new com.role.grpc.Role(this);
      result.roleId_ = roleId_;
      result.roleName_ = roleName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.role.grpc.Role) {
        return mergeFrom((com.role.grpc.Role)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.role.grpc.Role other) {
      if (other == com.role.grpc.Role.getDefaultInstance()) return this;
      if (other.getRoleId() != 0) {
        setRoleId(other.getRoleId());
      }
      if (!other.getRoleName().isEmpty()) {
        roleName_ = other.roleName_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.role.grpc.Role parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.role.grpc.Role) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int roleId_ ;
    /**
     * <code>int32 role_id = 4;</code>
     */
    public int getRoleId() {
      return roleId_;
    }
    /**
     * <code>int32 role_id = 4;</code>
     */
    public Builder setRoleId(int value) {
      
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 role_id = 4;</code>
     */
    public Builder clearRoleId() {
      
      roleId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object roleName_ = "";
    /**
     * <code>string role_name = 1;</code>
     */
    public java.lang.String getRoleName() {
      java.lang.Object ref = roleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string role_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRoleNameBytes() {
      java.lang.Object ref = roleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string role_name = 1;</code>
     */
    public Builder setRoleName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roleName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string role_name = 1;</code>
     */
    public Builder clearRoleName() {
      
      roleName_ = getDefaultInstance().getRoleName();
      onChanged();
      return this;
    }
    /**
     * <code>string role_name = 1;</code>
     */
    public Builder setRoleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roleName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.role.grpc.Role)
  }

  // @@protoc_insertion_point(class_scope:com.role.grpc.Role)
  private static final com.role.grpc.Role DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.role.grpc.Role();
  }

  public static com.role.grpc.Role getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Role>
      PARSER = new com.google.protobuf.AbstractParser<Role>() {
    public Role parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Role(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Role> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Role> getParserForType() {
    return PARSER;
  }

  public com.role.grpc.Role getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

